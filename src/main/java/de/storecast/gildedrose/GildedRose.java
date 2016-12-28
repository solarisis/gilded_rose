package de.storecast.gildedrose;

@Deprecated
class GildedRose implements GildedRoseService{
    Item[] items;

    public GildedRose(Item[] items)
    {
        this.items = items;
    }

    @Override
    public void updateQuality(Item[] items)
    {
        updateQuality();
    }

    public void updateQuality()
    {
        for (int i = 0; i < items.length; i++)
        {

            Item item = items[i];

            if (!item.name.equals("Aged Brie") && !item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
            {
                if (item.quality > 0) 
                {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) 
                    {
                        item.quality = item.quality - 1;
                    }
                }
            }
            else 
            {
                if (item.quality < 50) 
                {
                    item.quality = item.quality + 1;

                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) 
                    {
                        if (item.sellIn < 11) 
                        {
                            if (item.quality < 50) 
                            {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 6) 
                        {
                            if (item.quality < 50) 
                            {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) 
            {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) 
            {
                if (!item.name.equals("Aged Brie")) 
                {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) 
                    {
                        if (item.quality > 0) 
                        {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) 
                            {
                                item.quality = item.quality - 1;
                            }
                        }
                    } 
                    else 
                    {
                        item.quality = item.quality - item.quality;
                    }
                } 
                else 
                {
                    if (item.quality < 50) 
                    {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }

}
