import java.util.List;

public class newsTotal {

    private int total;//新闻数量
    private List<news> rows;//新闻列表

    public newsTotal(){}

    public newsTotal(int total, List<news> rows) {
        this.total = total;
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<news> getRows() {
        return rows;
    }

    public void setRows(List<news> rows) {
        this.rows = rows;
    }
}
