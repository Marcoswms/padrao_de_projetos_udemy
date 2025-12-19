package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.*;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    public IPhone createIphone(String level) {
        if ("standard".equals(level)) {
            return new IPhone11();
        } else if ("highEnd".equals(level)) {
            return new IPhone11Pro();
        } else return null;
    }
}