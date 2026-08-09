class Darts {
    int score(double xOfDart, double yOfDart) {
        double d = (double) Math.sqrt(xOfDart* xOfDart + yOfDart* yOfDart);
        if(d > 10) return 0;
        if(d > 5 & d <=10) return 1;
        if(d > 1 & d <= 5) return 5;
        return 10;
    }
}
