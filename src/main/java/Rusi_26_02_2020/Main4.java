package Rusi_26_02_2020;

public class Main4 {
    public static void main(String[] args) {
        //twitch, dao - data acces objects - intermediate
        //ORM -(SQL) Hibernate, ORMLite*,...
        String databaseUrl= "jdbc:h2:mem:blablaDaoEx";// db temporara locala
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl); //conectare la DB

        TableUtils.createTable(connectionSource, Account.class);

        Account account = new Account();//registru
        account.setName("Ramzes");
        account.setPassword("123456");// todo hash, salt
        System.out.println(account);

//        Dao<Account, String>  accountDao = new AccountDao();

        Dao<Account, String>  accountDao = DaoManager.createDao(connectionSource, Account.class);//todo pom before
        accountDao.create(account); //conectare - CRUD

        //query
        Account foundAccount = accountDao.queryForId("Ramzes"); //(name, pas, id
        System.out.println(foundAccount);

        Game game = new Game();
        game.setName("Dota2");
        game.setPublisher("Valve");
        //System.out.println(game);

        connectionSource.close();
    }
}
//videostreaming fara sql?
//user - account
//pattern DAO