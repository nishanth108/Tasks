package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Arachnid;
import com.xworkz.inheritence.inner.Spider;

public class SpiderRunner5 {
    public void info(Arachnid arachnid) {
        if (arachnid!=null) {
            arachnid.eat();
            arachnid.run();
            arachnid.color();
            arachnid.size();

            if (arachnid instanceof Spider) {
                Spider spider = (Spider)arachnid;
                spider.skill();
            }
        }
    }
}
