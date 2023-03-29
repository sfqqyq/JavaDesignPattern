package sfqqyq.享元模式;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {

    private Map<String,Drawable> images;// 图库

    public TileFactory() {
        this.images = new HashMap<String,Drawable>();
    }

    public Drawable getDrawable(String image){
        // 如果缓存池中如果没有图件，则实例化并放入缓存池
        if(!images.containsKey(image)){
            switch (image){
                case "河流":
                    images.put("河流",new River());
                    break;
                case "草地":
                    images.put("草地",new Grass());
                    break;
                case "道路":
                    images.put("道路",new Stone());
                    break;
                case "房子":
                    images.put("房子",new House());
                    break;
            }
        }
        // 从缓存中获取图件
        return images.get(image);

    }

}
