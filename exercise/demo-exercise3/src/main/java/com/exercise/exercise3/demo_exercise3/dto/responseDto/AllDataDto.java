package com.exercise.exercise3.demo_exercise3.dto.responseDto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class AllDataDto {
  private Long id;
  private String name;
  private String username;
  private String email;
  private AdderssDto address;
  private String phone;
  private String website;
  private CompanyDto company;
  private List<PostDto> posts;

  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  @Getter
  @EqualsAndHashCode
  public static class PostDto {
    private Long id;
    private String title;
    private String body;
    private List<CommentDto> comments;

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    @EqualsAndHashCode
    public static class CommentDto {
      private Long id;
      private String name;
      private String email;
      private String body;
    }
  }

  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  @Getter
  @EqualsAndHashCode
  public static class AdderssDto {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoDto geoDto;

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    @EqualsAndHashCode
    public static class GeoDto {
      private String lat;
      private String lng;
    }
  }

  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  @Getter
  @EqualsAndHashCode
  public static class CompanyDto {
    private String name;
    private String catchPhrase;
    private String bs;
  }
}

