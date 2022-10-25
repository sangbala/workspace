package Television;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv=new Television("LG",7);

        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.setVolume(88);
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        Television invalidTvBrand=new Television("Hisense",7);
        System.out.println(invalidTvBrand);
        Television invalidTvVolume=new Television("Sony",117);

        System.out.println("display:"+tv.getDisplay());
        Television tvWith3arg=new Television("LG",7, DisplayType.PLASMA);
        System.out.println(tvWith3arg.toString());
        Television tvWith3arg1=new Television("LG",99);
        System.out.println(tvWith3arg1.toString());
    }

}
