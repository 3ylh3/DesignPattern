package com.xiaobai.designpattern.compositepattern;

/**
 * 组合模式测试
 * 组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构， 使得用户对单个对象和组合对象的使用具有一致性。
 *
 * @author 小白
 * @date 2019/8/2
 */
public class CompositePatternTest {
    public static void main(String[] args) {
        System.out.println("----组合模式----");
        Composite root = new Composite();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
        CompositePatternTest test = new CompositePatternTest();
        test.display(root);
    }

    private void display(Composite root) {
        for(AbstractComponent c : root.getChildren()) {
            if(c instanceof Leaf) {
                c.doSomething();
            } else {
                display((Composite) c);
            }
        }
    }
}
