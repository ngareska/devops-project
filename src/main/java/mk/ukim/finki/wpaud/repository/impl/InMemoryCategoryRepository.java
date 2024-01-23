package mk.ukim.finki.wpaud.repository.impl;

import mk.ukim.finki.wpaud.bootstrap.DataHolder;
import mk.ukim.finki.wpaud.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository //adapter od koi sto se zimaat nekoi podatoci
public class InMemoryCategoryRepository {
    public List<Category> findAll()
    {
        return DataHolder.categories;
    }

    public Category save(Category c){
        if(c == null || c.getName() == null || c.getName().isEmpty())
        {
            return null;
        }
        DataHolder.categories.removeIf(r->r.getName().equals(c.getName())); //ako postoi se prebrisuva
        DataHolder.categories.add(c); //se dodava nova kategorijata
        return c; //vrakjame instanca od samata kategorija
    }

    public Optional<Category> findByName(String name){
        return DataHolder.categories.stream().filter(r->r.getName().equals(name)).findFirst();
    }

    public Optional<Category> findById(Long id){
        return DataHolder.categories.stream().filter(r->r.getId().equals(id)).findFirst();
    }

    public List<Category> search(String text){
        return DataHolder.categories.stream().filter(r->r.getName().contains(text) || r.getDescription().contains(text)).collect(Collectors.toList());
    }

    public void delete(String name)
    {
        if(name == null)
        {
            return;
        }
        DataHolder.categories.removeIf(r->r.getName().equals(name));
    }
}
