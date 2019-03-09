import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JsonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        news news1 = new news(110, "日本地震", "日本福田发生了7级地震");
        news news2 = new news(111, "Apple库克第八次访华", "近日库克第八次访华，与滴滴高层会谈");
        news news3 = new news(113, "Google I/O大会开幕", "Google开发者大会即将举办，是否推出Android7.0?");
        news news4 = new news(114, "格力营收下滑400亿", "格里营收下滑400亿，董明珠说我活得好的很");

        //获取get请求参数page的值
        String page = req.getParameter("page");
        List<news> newsList = new ArrayList<>();
        if (page == null || page.equals("0")){
            newsList.add(news1);
            newsList.add(news2);
        } else {
            newsList.add(news3);
            newsList.add(news4);
        }

        newsTotal nt = new newsTotal(newsList.size(),newsList);
        Gson gson = new Gson();
        String json = gson.toJson(nt);

        System.out.println(json);
        //使客户端浏览器，区分不同种类的数据，并根据不同的MIME调用浏览器内不同的程序嵌入模块来处理相应的数据
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("gb2312");
        PrintWriter pw = new PrintWriter(resp.getOutputStream());
        pw.print(json);
        pw.flush();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
