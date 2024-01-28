package ru.netology.manager;
public class MovieManager {
    private String[] movies = new String[0];
    private int limit;
    public MovieManager(){
        this.limit = 5;
    }
    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie){
        String[] tmp = new String[movies.length+1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length-1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resulLength;
        if (movies.length < limit) {
            resulLength = movies.length;
        } else {
            resulLength = limit;
        }
        String[] ans = new String[resulLength];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - 1 - i];
        }
        return ans;
    }
}
