package com.aqiang.algorithm.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 最简单的FIFO队列
 *
 * @ClassName MyQueue
 * @Description TODO
 * @Author aqiang
 * @Date 2021/7/13 23:09
 */

public class MyQueue {
    private List<Integer> data;
    private int p_start;

    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    /**
     * 添加
     *
     * @param i
     * @return boolean
     */
    public boolean add(Integer i){
        data.add(i);
        return true;
    }

    /**
     * 删除
     *
     * @return boolean
     */
    public boolean delete(){
        if (isEmpty()) return false;
        p_start++;
        return true;
    }

    /**
     * 是空的
     *
     * @return boolean
     */
    public boolean isEmpty(){
        return p_start>=data.size();
    }

    /**
     * 得到最前面元素
     *
     * @return {@link Integer}
     */
    public Integer getFront(){
        return data.get(p_start);
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println(queue.getFront());
        queue.delete();
        System.out.println(queue.getFront());
    }

}