package dev.bertoluci.menu.core.food;

import dev.bertoluci.menu.response.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "foods")
@Table(name = "foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }

}
