public class UserManager {
    public void login(User user){
        System.out.println(user.getId()+ " numaralı kullanıcı sisteme giriş yaptı");
    }

    public void logOut(User user){
        System.out.println(user.getId()+ " numaralı kullanıcı sistemden çıkış yaptı");
    }

    public void signUp(User user){
        System.out.println(user.getId()+ " numaralı kullanıcı sisteme kaydoldu");
    }
}
