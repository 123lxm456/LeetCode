class Foo {

    boolean isfirst;
    boolean issecond;
    public Foo() {
        isfirst = false;
        issecond = false;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        isfirst = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        while(!isfirst)
        {
            Thread.sleep(1);
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        issecond = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(!issecond)
        {
            Thread.sleep(1);
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}

/*
只要 first () 先执行完
→ 后面怎么乱序都不会死循环
如果 first () 一直抢不到 CPU
→ second () 死循环占着 CPU
→ 整个程序卡死 / 超时
这就是为什么：
[1,3,2] 能过
[2,3,1] 会超时
*/
