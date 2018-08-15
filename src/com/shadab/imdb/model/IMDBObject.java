package com.shadab.imdb.model;

import java.util.ArrayList;

public class IMDBObject
{
  private int v;

  public int getV() { return this.v; }

  public void setV(int v) { this.v = v; }

  private String q;

  public String getQ() { return this.q; }

  public void setQ(String q) { this.q = q; }

  private ArrayList<D> d;

  public ArrayList<D> getD() { return this.d; }

  public void setD(ArrayList<D> d) { this.d = d; }
}