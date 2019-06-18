package andy.leaf.utils;

import java.util.List;

public class PageResult<T> {
    //共有数据条数
    private Long total;
    //共有页数
    private Integer pageTotal;
    //当前页
    private Integer page;
    //每页显示多杀条
    private Integer pageSize;
    //结果集
    private List<T> list;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", pageTotal=" + pageTotal +
                ", page=" + page +
                ", pageSize=" + pageSize +
                ", list=" + list +
                '}';
    }
}
