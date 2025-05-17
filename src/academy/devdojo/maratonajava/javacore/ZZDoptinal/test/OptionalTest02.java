package academy.devdojo.maratonajava.javacore.ZZDoptinal.test;

import academy.devdojo.maratonajava.javacore.ZZDoptinal.Repository.MangaRepository;
import academy.devdojo.maratonajava.javacore.ZZDoptinal.domain.Manga;

public class OptionalTest02 {
    public static void main(String[] args) {
        MangaRepository.findByTitle("Bleach")
                .ifPresent(m -> m.setTitle("Bleach - thousand year blood war")); //Se existe muda o titulo

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new); // Caso não exista lança uma exceção

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Naruto")
                .orElseGet(() -> new Manga(3, "Naruto", 680)); // Caso nao ache, pegue o novo manga e crie

        System.out.println(newManga);

    }
}
