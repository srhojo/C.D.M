package io.github.srhojo.utils.cdm;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.github.srhojo.utils.cdm.enums.UnitiesEnum;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author: srhojo
 * @see <a href="https://github.com/srhojo">GitHub</a>
 *
 */
public class Quantity implements Serializable {

    private static final long serialVersionUID = -1642155337787270868L;

    @NotNull
    @ApiModelProperty(name = "quantity", required = true, example = "1")
    private Float value;

    @NotNull
    @ApiModelProperty(name = "Unities", required = true, example = "KILOGRAMS")
    private UnitiesEnum Unities;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(final Float value) {
        this.value = value;
    }

    public UnitiesEnum getUnities() {
        return Unities;
    }

    public void setUnities(final UnitiesEnum unities) {
        Unities = unities;
    }
}
