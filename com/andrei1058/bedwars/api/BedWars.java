package com.andrei1058.bedwars.api;

import com.andrei1058.bedwars.Main;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.UUID;

public class BedWars implements GameAPI {

    @Override
    public ServerType getServerType() {
        return Main.getServerType();
    }

    @Override
    public int getApiVersion() {
        return 3;
    }

    @Override
    public boolean isStats() {
        return false;
    }

    @Override
    public Timestamp getPlayerFirstPlay(Player p) {
        return null;
    }

    @Override
    public Timestamp getPlayerLastPlay(Player p) {
        return null;
    }

    @Override
    public int getPlayerWins(Player p) {
        return 0;
    }

    @Override
    public int getPlayerKills(Player p) {
        return 0;
    }

    @Override
    public int getPlayerFinalKills(Player p) {
        return 0;
    }

    @Override
    public int getPlayerLooses(Player p) {
        return 0;
    }

    @Override
    public int getPlayerDeaths(Player p) {
        return 0;
    }

    @Override
    public int getPlayerFinalDeaths(Player p) {
        return 0;
    }

    @Override
    public int getPlayerBedsDestroyed(Player p) {
        return 0;
    }

    @Override
    public int getPlayerGamesPlayed(Player p) {
        return 0;
    }

    @Override
    public HashMap<UUID, Integer> getTopWins(int x) {
        return null;
    }

    @Override
    public HashMap<UUID, Integer> getTopKills(int x) {
        return null;
    }

    @Override
    public HashMap<UUID, Integer> getTopFinalKills(int x) {
        return null;
    }

    @Override
    public HashMap<UUID, Integer> getTopLooses(int x) {
        return null;
    }

    @Override
    public HashMap<UUID, Integer> getTopDeaths(int x) {
        return null;
    }

    @Override
    public HashMap<UUID, Integer> getTopFinalDeaths(int x) {
        return null;
    }

    @Override
    public HashMap<UUID, Integer> getTopBedsDestroyed(int x) {
        return null;
    }

    @Override
    public HashMap<UUID, Integer> getTopGamesPlayed(int x) {
        return null;
    }

    @Override
    public boolean isPlaying(Player p) {
        return false;
    }

    @Override
    public boolean isSpectating(Player p) {
        return false;
    }


}
