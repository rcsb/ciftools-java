    /**
{columnDescription}
     * @return {baseClassName}
     */
    public {baseClassName} get{columnClassName}() {
        return delegate.getColumn("{columnName}", Delegating{baseClassName}::new);
    }

