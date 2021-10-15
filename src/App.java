public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Alakzatok területe, kerülete");

        ResultStore resultStore = new ResultStore(new SqliteStore());
        resultStore.insert(525, 1024);
    }
}
