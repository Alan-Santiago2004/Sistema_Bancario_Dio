package com.banco.domain.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity(name = "tb_features")
@Table(name = "tb_features")
public class FeatureModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String icon;
    private String description;

    public FeatureModel() {
    }

    public FeatureModel(UUID id, String icon, String description) {
        this.id = id;
        this.icon = icon;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FeatureModel that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
