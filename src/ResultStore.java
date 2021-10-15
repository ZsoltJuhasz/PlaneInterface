

public class ResultStore {
    Store store;
    public ResultStore(Store store) {
        this.store = store;
    }
    public void insert(double area, double perimeter) {
        store.setData(area, perimeter);
        store.insert();
    }    
}
