package packages.transport;

class PassportUtil {
static Passport changeOwner (String newOwner, Passport oldPassport){
    Passport passport = new Passport();
  passport.setOwnerName(newOwner);
    passport.setHorsePower(oldPassport.getHorsePower());
    passport.setTransportName(oldPassport.getTransportName());
    return passport;
    }

}
