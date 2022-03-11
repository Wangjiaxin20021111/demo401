package POJI;

import java.util.ArrayList;
import java.util.List;

public class Pageben1<T> {

    private int totalCount;//总记录数
    private int totalPage;//总页码数
    private List<T> list;//每页的数据list集合
    private int currentPage;//当前页码
    private int rows;//每页显示的信息数

    public int getTotalCount() {
        return totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }


    @Override
    public String toString() {
        return "Pageben1{" +
                "totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", list=" + list +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                '}';
    }
}
