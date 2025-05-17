package academy.devdojo.maratonajava.javacore.ZZDoptinal.Repository;


import academy.devdojo.maratonajava.javacore.ZZDoptinal.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1,"Bleach",623),new Manga(2,"Black clover",325));

    public static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }
    public static Optional<Manga> findByTitle(String title){
      return findBy(m -> m.getTitle().equals(title));
    }
    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for(Manga manga: mangas){
            if(predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
