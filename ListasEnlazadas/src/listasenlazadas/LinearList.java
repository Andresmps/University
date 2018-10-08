/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

public interface LinearList<Item> {

    public boolean isEmpty();

    public int size();

    public Item get(int index);

    public int indexOf(Item theElement);

    public Item remove(int index);

    public void add(int index, Item theElement);

    @Override
    public String toString();
}
