package Low_Level.Real_Scanerio.VendingMachine;

public class Inventory {
    
    ItemShelf[] inventory = null;

    Inventory(int itemCount){
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory(){
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void initialEmptyInventory(){
        int startCode = 101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i] = space;
            startCode++;
        }
    }

    public void addItem(Item item,int codeNumber) throws Exception{
        for(ItemShelf x : inventory){
            if(x.code == codeNumber){
                if(x.isSoldOut()){
                    x.item = item;
                    x.setSoldOut(false);
                }else{
                    throw new Exception("Already item is present, you can not add item here");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception{
        for(ItemShelf x : inventory){
            if(x.code == codeNumber){
                if(x.isSoldOut()){
                    throw new Exception("item already solf out!");
                }else{
                    return x.item;
                }
            }
        }
        throw new Exception("Invalid code");
    }

    public void updateSoldOutItem(int codeNumber){
        for(ItemShelf x : inventory){
            if(x.code == codeNumber){
                x.setSoldOut(true);
            }
        }
    }

}
