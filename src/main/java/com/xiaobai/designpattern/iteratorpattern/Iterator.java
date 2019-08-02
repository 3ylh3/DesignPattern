package com.xiaobai.designpattern.iteratorpattern;

/**
 * 迭代器接口
 *
 * @author 小白
 * @date 2019/8/2
 */
public interface Iterator {
    /**
     * 遍历到下一个元素
     * @return 下一个元素
     */
    Object next();

    /**
     * 是否已遍历到队尾
     * @return 是否已遍历到队尾
     */
    boolean hasNext();

    /**
     * 删除当前指向元素
     * @return 是否删除成功
     */
    boolean remove();
}
