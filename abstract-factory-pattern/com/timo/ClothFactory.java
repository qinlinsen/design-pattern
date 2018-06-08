package com.timo;

/**
 * @author qinlinsen
 */
public class ClothFactory implements AbstractFactory {
    private static final String SPORTS = "sports";
    private static final String STYLE = "style";
    @Override
    public Cloth getCloth(String clothType) {
        if(clothType==null){

            return  null;
        }
        if(clothType.equalsIgnoreCase(SPORTS)){
            return new SportsCloth();
        }
        if(clothType.equalsIgnoreCase(STYLE)){
            return new StyleCloth();
        }
        return null;
    }

    @Override
    public Shoe getShoe(String shoeType) {
        return null;
    }

    public void test() {
        int a;
        int b;
        
    }
}
