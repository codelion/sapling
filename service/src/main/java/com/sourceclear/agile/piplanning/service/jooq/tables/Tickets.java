/*
 * This file is generated by jOOQ.
 */
package com.sourceclear.agile.piplanning.service.jooq.tables;


import com.sourceclear.agile.piplanning.service.jooq.Agile;
import com.sourceclear.agile.piplanning.service.jooq.Indexes;
import com.sourceclear.agile.piplanning.service.jooq.Keys;
import com.sourceclear.agile.piplanning.service.jooq.tables.records.TicketsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tickets extends TableImpl<TicketsRecord> {

    private static final long serialVersionUID = -674674624;

    /**
     * The reference instance of <code>agile.tickets</code>
     */
    public static final Tickets TICKETS = new Tickets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TicketsRecord> getRecordType() {
        return TicketsRecord.class;
    }

    /**
     * The column <code>agile.tickets.id</code>.
     */
    public final TableField<TicketsRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('tickets_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>agile.tickets.board_id</code>.
     */
    public final TableField<TicketsRecord, Long> BOARD_ID = createField(DSL.name("board_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>agile.tickets.description</code>.
     */
    public final TableField<TicketsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>agile.tickets.weight</code>.
     */
    public final TableField<TicketsRecord, Integer> WEIGHT = createField(DSL.name("weight"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>agile.tickets.epic_id</code>.
     */
    public final TableField<TicketsRecord, Long> EPIC_ID = createField(DSL.name("epic_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>agile.tickets</code> table reference
     */
    public Tickets() {
        this(DSL.name("tickets"), null);
    }

    /**
     * Create an aliased <code>agile.tickets</code> table reference
     */
    public Tickets(String alias) {
        this(DSL.name(alias), TICKETS);
    }

    /**
     * Create an aliased <code>agile.tickets</code> table reference
     */
    public Tickets(Name alias) {
        this(alias, TICKETS);
    }

    private Tickets(Name alias, Table<TicketsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tickets(Name alias, Table<TicketsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Tickets(Table<O> child, ForeignKey<O, TicketsRecord> key) {
        super(child, key, TICKETS);
    }

    @Override
    public Schema getSchema() {
        return Agile.AGILE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TICKETS_BOARD_ID_IDX);
    }

    @Override
    public Identity<TicketsRecord, Long> getIdentity() {
        return Keys.IDENTITY_TICKETS;
    }

    @Override
    public UniqueKey<TicketsRecord> getPrimaryKey() {
        return Keys.TICKETS_PKEY;
    }

    @Override
    public List<UniqueKey<TicketsRecord>> getKeys() {
        return Arrays.<UniqueKey<TicketsRecord>>asList(Keys.TICKETS_PKEY);
    }

    @Override
    public List<ForeignKey<TicketsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TicketsRecord, ?>>asList(Keys.TICKETS__TICKETS_BOARD_ID_FKEY, Keys.TICKETS__TICKETS_EPIC_ID_FKEY);
    }

    public Boards boards() {
        return new Boards(this, Keys.TICKETS__TICKETS_BOARD_ID_FKEY);
    }

    public Epics epics() {
        return new Epics(this, Keys.TICKETS__TICKETS_EPIC_ID_FKEY);
    }

    @Override
    public Tickets as(String alias) {
        return new Tickets(DSL.name(alias), this);
    }

    @Override
    public Tickets as(Name alias) {
        return new Tickets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tickets rename(String name) {
        return new Tickets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tickets rename(Name name) {
        return new Tickets(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, String, Integer, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
