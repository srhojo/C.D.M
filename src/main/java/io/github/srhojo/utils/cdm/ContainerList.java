package io.github.srhojo.utils.cdm;

import java.util.List;

/**
 *
 * @author: srhojo
 * @see <a href="https://github.com/srhojo">GitHub</a>
 *
 */
public class ContainerList<T> {

    private List<T> values;
    private OffsetPagination pagination;

    public ContainerList() {
        // do nothing
    }

    public ContainerList(final List<T> values) {
        super();
        this.values = values;
    }

    public ContainerList(final List<T> values, final OffsetPagination pagination) {
        this.values = values;
        this.pagination = pagination;
    }

    /**
     * @return the values
     */
    public List<T> getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(final List<T> values) {
        this.values = values;
    }

    public OffsetPagination getPagination() {
        return pagination;
    }

    public void setPagination(final OffsetPagination pagination) {
        this.pagination = pagination;
    }
}
