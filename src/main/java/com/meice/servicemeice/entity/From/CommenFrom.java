package com.meice.servicemeice.entity.From;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class CommenFrom implements Serializable{
    private static final long serialVersionUID = -7440446558051469628L;
    @NotNull
    int page;
    @NotNull
    int pageSize;


    public int start() {
        return this.page > 1 ? (this.page - 1) * this.pageSize : 0;
    }
}
