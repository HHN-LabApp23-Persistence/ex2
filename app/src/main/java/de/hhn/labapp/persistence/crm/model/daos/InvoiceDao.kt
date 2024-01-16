package de.hhn.labapp.persistence.crm.model.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import de.hhn.labapp.persistence.crm.model.entities.Invoice

@Dao
interface InvoiceDao {
    @Query("SELECT * FROM invoice")
    fun getAll(): List<Invoice>

    @Query("SELECT * FROM invoice WHERE id = :id")
    fun get(id: Int): Invoice?

    @Insert
    fun insert(invoice: Invoice)

    @Insert
    fun insertAll(invoices: List<Invoice>)

    @Update
    fun update(invoice: Invoice)

    @Upsert
    fun upsert(invoice: Invoice)

    @Delete
    fun delete(invoice: Invoice)
}
