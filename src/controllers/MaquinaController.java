package controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import models.Maquina;

public class MaquinaController {
    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral) {
        Stack<Maquina> resultado = new Stack<>();
        for (Maquina m : maquinas) {
            if (m.getSubred() > umbral) {
                resultado.push(m);
            }
        }
        return new Stack<Maquina>() ;
    }
     public Set<Maquina> ordenarPorSubred(Stack<Maquina> pila) {
        List<Maquina> lista = new ArrayList<>(pila);
        lista.sort(Comparator.comparingInt(Maquina::getSubred));
        return new TreeSet<Maquina>(lista); 
    }

       public Map<Integer, Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas) {
        Map<Integer, Queue<Maquina>> mapa = new HashMap<>();
        for (Maquina m : maquinas) {
            int riesgo = m.getRiesgo();
            mapa.computeIfAbsent(riesgo, k -> new LinkedList<>()).add(m);
        }
        return mapa;
    }

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>> mapa) {
        Stack<Maquina> resultado = new Stack<>();
        for (Queue<Maquina> grupo : mapa.values()) {
            while (!grupo.isEmpty()) {
                resultado.push(grupo.poll());
            }
        }
        return resultado;
    }

}
