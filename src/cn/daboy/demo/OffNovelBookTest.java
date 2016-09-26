package cn.daboy.demo;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/9/26.
 */
public class OffNovelBookTest extends TestCase {
    private IBook below40NovelBook = new OffNovelBook("平凡的世界",3000,"路遥");
    private IBook above40NovelBook = new OffNovelBook("平凡的世界",6000,"路遥");

    public void testGetPriceBelow40() {
        super.assertEquals(2400,this.below40NovelBook.getPrice());
    }

    public void testGetPriceAbove40() {
        super.assertEquals(5400,this.above40NovelBook.getPrice());
    }


}
