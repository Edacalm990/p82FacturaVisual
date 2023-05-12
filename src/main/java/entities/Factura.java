/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author eli
 */
@Entity
@Table(name = "factura")
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f"),
    @NamedQuery(name = "Factura.findByCodigoUnico", query = "SELECT f FROM Factura f WHERE f.codigoUnico = :codigoUnico"),
    @NamedQuery(name = "Factura.findByFechaEmision", query = "SELECT f FROM Factura f WHERE f.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "Factura.findByDescripcion", query = "SELECT f FROM Factura f WHERE f.descripcion = :descripcion"),
    @NamedQuery(name = "Factura.findByTotalImporte", query = "SELECT f FROM Factura f WHERE f.totalImporte = :totalImporte")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoUnico")
    private Integer codigoUnico;
    @Column(name = "fechaEmision")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totalImporte")
    private double totalImporte;

    public Factura() {
    }

    public Factura(Integer codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public Integer getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(Integer codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(double totalImporte) {
        this.totalImporte = totalImporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoUnico != null ? codigoUnico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.codigoUnico == null && other.codigoUnico != null) || (this.codigoUnico != null && !this.codigoUnico.equals(other.codigoUnico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Factura: %d - Emision: %s - Descripcion: %s - Importe: %s €".formatted(codigoUnico, new SimpleDateFormat("dd-MM-yyyy").format(fechaEmision), descripcion, totalImporte);
         
    }
    
}
