package io.github.srhojo.utils.cdm;

/**
 *
 * @author srhojo
 * @see <a href="https://github.com/srhojo">GitHub</a>
 *
 */
public class OffsetPagination {

    private final Integer limit;
    private final Long offset;
    private final Long totalElements;

    public OffsetPagination(final Integer limit, final Long offset, final Long totalElements) {
        this.limit = limit;
        this.offset = offset;
        this.totalElements = totalElements;
    }

    public Integer getLimit() {
        return limit;
    }

    public Long getOffset() {
        return offset;
    }

    public Long getTotalElements() {
        return totalElements;
    }
}
