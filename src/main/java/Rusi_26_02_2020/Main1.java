package Rusi_26_02_2020;

public class Main1 {
    public static void main(String[] args) {
        //twitch, dao - data acces objects - intermediate
        Account account = new Account();
        account.setName("Ramzes");
        account.setPassword("123456");// to do hash, salt
        System.out.println(account);

//        Db.saveAccount(account);// nu se poate
//        Db.saveGame(game);// nu se fac clase universale
        AccountDao   accountDao = new AccountDao();
        accountDao.create(account); //conectare - CRUD

        //query
        Account foundAccount = accountDao.queryForId("Ramzes"); //(name, pas, id
        System.out.println(foundAccount);

        Game game = new Game();
        game.setName("Dota2");
        game.setPublisher("Valve");
        //System.out.println(game);
    }
}
//videostreaming fara sql?
//user - account
//pattern DAO