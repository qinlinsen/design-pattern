package com.timo

/**
 * @author qinlinsen
 */
class ShoeFactory : AbstractFactory {

    override fun getCloth(clothType: String): Cloth? {
        return null
    }

    override fun getShoe(shoeType: String?): Shoe? {
        if (shoeType == null) {
            return null
        }
        if () {
        }
        return null
    }

    companion object {
        private val SPORTS = "sports"
    }
}
