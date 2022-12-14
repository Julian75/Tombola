package com.gecco.Service;

import java.util.List;

import com.gecco.Entity.ConsultaRaspa;
import com.gecco.EntityModifica.Accesos2;
import com.gecco.EntityModifica.ArchivoSolicitud2;
import com.gecco.EntityModifica.AsigArtiReporteEmpresas;
import com.gecco.EntityModifica.AsignacionActivoConsulta;
import com.gecco.EntityModifica.AsignacionActivoPuntoVentaConsulta;
import com.gecco.EntityModifica.AsignacionPuntoVentaArticulo2;
import com.gecco.EntityModifica.AsignacionesActivosPendiente2;
import com.gecco.EntityModifica.AsignacionesArticulos2;
import com.gecco.EntityModifica.AsignacionesProcesos2;
import com.gecco.EntityModifica.AsignarTurnoVendedor2;
import com.gecco.EntityModifica.AuditoriaActivo2;
import com.gecco.EntityModifica.AuditoriaActivoRegistro2;
import com.gecco.EntityModifica.Cotizacion2;
import com.gecco.EntityModifica.Cuenta2;
import com.gecco.EntityModifica.DetalleArticuloSinBaja;
import com.gecco.EntityModifica.DetalleSolicitud2;
import com.gecco.EntityModifica.GestionProceso2;
import com.gecco.EntityModifica.Historial2;
import com.gecco.EntityModifica.HistorialArticulo2;
import com.gecco.EntityModifica.HistorialSolicitudes2;
import com.gecco.EntityModifica.Inventario2;
import com.gecco.EntityModifica.LibroMayor2;
import com.gecco.EntityModifica.MatrizNecesidadConsultaCierre;
import com.gecco.EntityModifica.MatrizNecesidadDetalle2;
import com.gecco.EntityModifica.OrdenCompra2;
import com.gecco.EntityModifica.PorcentajePresupuesto2;
import com.gecco.EntityModifica.PresupuestoContable2;
import com.gecco.EntityModifica.Proceso2;
import com.gecco.EntityModifica.Raspas2;
import com.gecco.EntityModifica.Soporte2;
import com.gecco.EntityModifica.UsuariosAdministracion2;
import com.gecco.EntityModifica.matrizNecesidadDetalleConsulta;

public interface IConsultasGeneralesService {

	List<ConsultaRaspa> findByRaspa(String raspa);
	List<ConsultaRaspa> getAll();
	List<Cotizacion2> findByCotizacion(Integer idSolicitud);
	List<UsuariosAdministracion2> findByUsuariosAdministracion(Integer idSolicitud);
	List<OrdenCompra2> findByOrdenCompra(Integer idSolicitud);
	List<GestionProceso2> findByGestionProceso(Integer idUsuario);
	List<DetalleSolicitud2> findByDetalleSolicitud(Integer idSolicitud);
	List<Proceso2> findByProceso(Integer idCategoria);
	List<DetalleSolicitud2> findBySolicitudDetalleEst(Integer idSolicitud);
	List<DetalleSolicitud2> findBySolicitudDetalleEstados(Integer idSolicitud);
	List<Historial2> findByHistorial(Integer idSolicitud);
	List<Soporte2>findBySoporte(Integer idHistorial);
	List<ArchivoSolicitud2> findByArchivoSolicitud(Integer idSolicitud);
	List<AsignarTurnoVendedor2> findByAsignarTurnoVendedor(String fechaActual);
	List<Inventario2> findByArticulosBaja();
	List<AsignacionActivoConsulta> findByAsignacionArticulo(Long idUsuario);
	List<HistorialSolicitudes2> findByHistorialSolicitudes(Integer idSolicitud);
	List<Cuenta2> findByCuentas(Integer codigo);
	List<LibroMayor2> findByLibroMayor(Long idCuenta, String fecha);
	List<PorcentajePresupuesto2> findByPorcentajePresupuesto(Long idCuenta, String fecha);
	List<PresupuestoContable2> findByPresupuestoContable(String fecha);
	List<PresupuestoContable2> findByPresupuestoContableCuentaFecha(Long idCuenta, String fecha);
	List<LibroMayor2> findByLibroMayorFechas(Long idCuenta, String fecha);
	List<LibroMayor2> findByLibroMayoA??oyMes(String fecha);
	List<LibroMayor2> findByLibroMayorA??o(String fecha);
	List<Cuenta2> findByCuentasJerarquia(Long idJerarquiaCuenta);
	List<Raspas2> findByRaspasGecco(String fechaInicio, String fechaFinal);
	List<AuditoriaActivo2> findByAuditoriaActivo(Long idAuditoriaActivoRegistro, Long idAsignacionPuntoVentaActivo);
	List<AuditoriaActivoRegistro2> findByAuditoriaActivoRegistroFechas(String fechaInicio, String fechaFinal);
	List<AuditoriaActivoRegistro2> findByAuditoriaActivoRegistro(String fecha, Long idUsuario);
	List<GestionProceso2> findByGestionProcesoSolicitud(Long idDetalleSolicitud);
	List<AuditoriaActivo2> findByAuditoriaActivIdRegistro(Long idAuditoriaActivoRegistro);
	List<Accesos2> findByAccesos(Long idRol);
	List<MatrizNecesidadDetalle2> findByMatrizDetalleProceso(Long idTipoProceso, String fecha);
	List<AsignacionesProcesos2> findByAsignacionProceso(Long idUsuario);
	List<AsignacionActivoConsulta> findByAsignacionArticulosEstadoDetalle1(Long idUsuario);
	List<AsignacionActivoPuntoVentaConsulta> findByAsignacionArticulosSitioVenta(Long idProceso, Long ideOficina, Long ideSitioVenta);
	List<AsignacionPuntoVentaArticulo2> findByAsignacionActivoIdeDetalle(Long idDetalleActivo, Long ideOficina, Long ideSitioVenta);
	List<HistorialArticulo2> findByHistorialActivo(Long idDetalleActivo);
	List<AsignacionPuntoVentaArticulo2> findByAsignPuntoVentArtDetArtUsuario(Long idDetalleArticulo, Long idUsuario);
	List<AsignacionesActivosPendiente2> findByAsignacionesActivosPendiente(Long idUsuarioAsignacionPendiente, Long idDetalleActivo);
	List<AsignacionesArticulos2> findByAsignacionArticuloIdeDetArt(Long idDetalleActivo);
	List<AsignacionActivoPuntoVentaConsulta> findByAsignacionArticulosSerial(Long idProceso, String serial);
	List<AsignacionActivoPuntoVentaConsulta> findByAsignacionArticulosPlaca(Long idProceso, String placa);
	List<AsignacionActivoPuntoVentaConsulta> findByAsignacionArticulosidUsuario(Long idUsuario);
	List<AsignacionesProcesos2> findByAsignacionProcesoIdProceso(Long idProceso);
	List<matrizNecesidadDetalleConsulta> findByMatrizDetalleCompleto();
	List<matrizNecesidadDetalleConsulta> findByMatrizDetalleIdProcesoCompleto(Long idProceso);
	List<matrizNecesidadDetalleConsulta> findByMatrizDetalleIdSubprocesoCompleto(Long idSubProceso);
	List<matrizNecesidadDetalleConsulta> findByMatrizDetalleCompletoConsolidado();
	List<matrizNecesidadDetalleConsulta> findByMatrizDetalleIdProcesoCompletoConsolidado(Long idProceso);
	List<matrizNecesidadDetalleConsulta> findByMatrizDetalleIdSubprocesoCompletoConsolidado(Long idSubProceso);
	List<Accesos2> findByAccesosModulo76(Long idRol);
	List<matrizNecesidadDetalleConsulta> findByMatrizNecesidadesLista(String ano);
	List<matrizNecesidadDetalleConsulta> findByMatrizNecesidadesListaIdProceso(Long idUsuario);
	List<AsignacionesArticulos2> findByAsignArticuloDetalleArtUsuario(Long idDetalleArticulo, Long idUsuario, String dispositivo);
	List<AsignacionesArticulos2> findByAsignacionArticulosBajaUsuario(Long idUsuario, String dispositivo);
	List<AsignacionesArticulos2> findByAsignacionArticuloUsuario(Long idUsuario, String dispositivo);
	List<DetalleArticuloSinBaja> findByAsignacionesActivosSinBaja();
	List<DetalleArticuloSinBaja> findByAsignacionesActivosCompletos();
	List<matrizNecesidadDetalleConsulta> findByMatrizNecesidadPrimerA??o();
	List<MatrizNecesidadConsultaCierre> findByMatrizNecesidadFechaProceso(String fecha, Long idTipoProceso);
	List<MatrizNecesidadDetalle2> findByMatrizDetalleIdMatriz(Long idMatriz);
	List<AsignacionPuntoVentaArticulo2> findByAsignPuntoVentActivoIdAsignActivo(Long idAsignacionActivo);
	List<AsigArtiReporteEmpresas> findByAsignArtReporteEmpresa();
}
