package exam;

import java.util.List;

// TODO: 完成这个类

public class PaginationHelper<I> {

    /**
     * 构造函数包含
     * 1）数组collection，表示需要分页的所有元素
     * 2）数字itemsPerPage，表示每页的元素个数
     */
	private List<I> collection;
	private int itemsPerPage;
	private int pages;
	private int count;
	
    public PaginationHelper(List<I> collection, int itemsPerPage) {
    	this.collection = collection;
    	this.itemsPerPage = itemsPerPage;
    }

    /**
     * 返回collection中所有元素的个数
     */
    public int itemCount() {
    	return count = this.collection.size();
//        throw new RuntimeException();
    }

    /**
     * 返回页数
     */
    public int pageCount() {
    	int num = this.collection.size() / this.itemsPerPage;
    	pages=this.collection.size() % this.itemsPerPage == 0 ? num : num+1;
    	return pages;
//        throw new RuntimeException();
    }

    /**
     * 返回当前页pageIndex中所包含的元素个数
     * pageIndex从0开始计数
     * 如果pageIndex为非法值则返回-1
     */
    public int pageItemCount(int pageIndex) {
    	if(pageIndex < 0 || pageIndex >= pageCount()) {
    		return -1;
    	}else {
    		if(itemCount() % itemsPerPage == 0) {
    			return itemsPerPage;
    		}else if(pageIndex == pageCount() - 1){
    			 {
    				return itemCount() % itemsPerPage;
    			}
    		}else {
    			return itemsPerPage;
    		}
    	}
    }

    /**
     * 返回第itemIndex个元素所在的页数
     * pageIndex从0开始计数
     * 如果itemIndex为非法值则返回-1
     */
    public int pageIndex(int itemIndex) {
    	if(itemIndex <= 0 || itemIndex > itemCount()) {
    		return -1;
    	}else {
    		return itemIndex / itemsPerPage;
    		
    	}
    }
}