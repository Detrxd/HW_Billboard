package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Films {
  private int id;
  private String pictureURL;
  private String filmName;
  private String filmStyle;

}
