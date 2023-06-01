package org.example;

public class posterManager {

    private int limit;

    public posterManager() {
        this.limit = 5;

    }

    public posterManager(int limit) {

        this.limit = limit;
    }

    private String[] posters = new String[0];

    public void addPosters(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public String[] showAllPoster() {
        return posters;

    }

    public String[] showLastPoster() {
        int actuallyPosters;
        if (posters.length < limit) {
            actuallyPosters = posters.length;
        } else {
            actuallyPosters = limit;
        }


        String[] tmp = new String[actuallyPosters];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}
