package upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.ServicesInterface;

import upc.edu.pe.api_arquiweb_backend_kevinpalian_1eraentrega.entities.Diagnostic;

import java.util.List;

public interface IDiagnosticService {
    public List<Diagnostic> list();
    public void insert(Diagnostic d);

    public Diagnostic searchbyId(int id);
    public void update(Diagnostic d);

    public void delete(int id);
}
