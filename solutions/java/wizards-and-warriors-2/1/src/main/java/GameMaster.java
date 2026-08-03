
public class GameMaster {

    public String describe (Character character){
        return String.format("You're a level %d %s with %d hit points.", character.getLevel(), character.getCharacterClass(), character.getHitPoints());
    }

    public String describe (Destination destination){
        return String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(), destination.getInhabitants());
    }

    public String describe (TravelMethod travelMethod){
        switch(travelMethod){
            case TravelMethod.HORSEBACK:
                return "You're traveling to your destination on horseback.";
            case TravelMethod.WALKING:
            default:
                return "You're traveling to your destination by walking.";
        }
    }

    public String describe (Character character, Destination destination,  TravelMethod travelMethod){
        StringBuilder result = new StringBuilder();
        result.append(describe(character)).append(" ");
        result.append(describe(travelMethod)).append(" ");
        result.append(describe(destination));
        return result.toString();
    }

    public String describe (Character character, Destination destinationd){
        StringBuilder result = new StringBuilder();
        result.append(describe(character)).append(" ");
        result.append(describe(TravelMethod.WALKING)).append(" ");
        result.append(describe(destinationd));
        return result.toString();
    }
}
