package com.globallogic.Entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Embeddable
public class SongId implements Serializable {

    private int sngid;
    private String songName;
}
