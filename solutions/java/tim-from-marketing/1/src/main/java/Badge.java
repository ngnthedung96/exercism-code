import java.util.Locale;

class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder result = new StringBuilder();

        if(id != null) result.append(String.format("[%d] - ", id));
        if(name != null) result.append(String.format("%s", name));
        if(department != null){
            result.append(String.format(" - %s", department.toUpperCase()));
        }else{
            result.append(" - OWNER");
        };
        return result.toString();
    };
}
