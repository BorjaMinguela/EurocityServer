/*
 * $Id: restLogic.java Nov 3, 2016 tta1617$
 * 
 * Copyright (C) 2015 Maider Huarte Arrayago
 * 
 * This file is part of TTA1617_LS-EX_9-11S.zip.
 * 
 * TTA1617_LS-EX_9-11S.zip is based on templates by Eclipse.org and it is
 * intended for learning purposes only.
 * 
 * TTA1617_LS-EX_9-11S.zip is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * TTA1617_LS-EX_9-11S.zip is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details <http://www.gnu.org/licenses/>.
 */
package bl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import bl.json.*;
import model.*;
//imports necesarios

@Singleton
@Path("/Eurocity")
public class LogicREST {
    @Context
    private javax.servlet.http.HttpServletRequest hsr;
    
    @PersistenceContext
    EntityManager em;
	
	public LogicREST() {
	}

	
	
	
	
	
//	@PostConstruct
//	private void buildUploadFolderTree() {
//		String contextName=hsr.getContextPath().substring(1);
//		String folderNames[]={"audio", "compressed", "docs", "files", "img", "video"};
//		
//		FileUtils.generateFolderTree(contextName, folderNames);
//		//Crear la carpeta contextName con las subcarpetas indicadas en folderNames, dentro de la ubicación por defecto
//	}
	
//	@Path("/uploadFile")
//	@POST//Anotación de método para REST
//    @Consumes("multipart/form-data")//Anotación del tipo de mensaje HTTP-req consumido
//    public Response uploadFile(MultipartFormDataInput input) {
//        System.out.println("uploadFile: "+hsr.getRemoteAddr());
//
//        Response httpResponse=FileUtils.uploadFile(input);//Recoger el fichero recibido como contenido multipart y escribirlo en la ubicación por defecto
//		
//        return httpResponse;		
//    }

	
	
	
	/*
	@SuppressWarnings("unchecked")
	//Anotación de método para REST
	//Anotación del tipo de datos producido
    @Path("/requestCalification")
	public Response requestCalification(@QueryParam("solutionName") String solutionName) {
		System.out.println("requestCalification: "+hsr.getRemoteAddr());
		Response response;
		String exerciseCode=solutionName.substring(solutionName.indexOf("E"),solutionName.indexOf("_"));
		String login=solutionName.substring(solutionName.indexOf("_")+1);
		
		List<Solution> solutionList=(List<Slolution>)em.createName//Consultar la lista de soluciones calificadas con código de ejercicio=exerciseCode y login=login
		//Si la lista es de 1 elemento (sólo puede haber un registro así en la tabla)
			response=Response.status(200).entity(solutionList.get(0).getCalification()).build();
		//si no
			response=//Construir HTTP-RESPONSE con contenido "NONE"

		return response;
	}	
*/
	@SuppressWarnings("unchecked")
	@GET//Anotación de método para REST
	@Produces(MediaType.TEXT_PLAIN)//Anotación del tipo de datos producido
	@Path("/requestUsers")	
	public String requestUsers() {
		System.out.println("test");
		System.out.println("requestUsers: "+hsr.getRemoteAddr());
		
		List<Foto> userList=(List<Foto>)em.createNamedQuery("Foto.findAll").getResultList();
		System.out.println("test2");
		
		for(int i=0;i<userList.size();i++){
			//System.out.println(userList.get(i).getNombre());
		}
		
		//userJSON.setLessons(userJSONList);//Meter la lista lessonJSONList en el objeto lessonsJSON

		return "test!";
	}
	
//	@SuppressWarnings("unchecked")
//	@GET//Anotación de método para REST
//	@Produces(MediaType.APPLICATION_JSON)//Anotación del tipo de datos producido
//	@Path("/requestUsers")	
//	public UserJSON requestUsers() {
//		System.out.println("test");
//		System.out.println("requestUsers: "+hsr.getRemoteAddr());
//		
//		UserJSON userJSON=new UserJSON();
//		//List<UserJSON> userJSONList=new ArrayList<UserJSON>();
//		
//		List<User> userList=(List<User>)em.createNamedQuery("User.findAll").getResultList();//Consultar la lista de todas las lecciones
//			
//		for(int i=0;i<userList.size();i++){//Para cada lección de la lista
//			User u=userList.get(i);
//			System.out.println(u.getNombre());
//			//UserJSON uJSON=new UserJSON(u.getNombre(),u.getFotoPerfil());//Crear objeto LessonJSON, copiando lessonCode y title
//			//userJSONList.add(uJSON);//Añadir objeto LessonJSON creado a la lista lessonJSONList
//		}
//		//userJSON.setLessons(userJSONList);//Meter la lista lessonJSONList en el objeto lessonsJSON
//
//		return userJSON;
//	}


//	@SuppressWarnings("unchecked")
//	@GET//Anotación de método para REST
//	@Produces(MediaType.APPLICATION_JSON)//Anotación del tipo de datos producido
//	@Path("/requestInitialData")
//	public InitialDataJSON requestInitialData(@QueryParam("login") String login, @QueryParam("lessonCode") String lessonCode) {
//		System.out.println("requestInitialData: "+hsr.getRemoteAddr());
//		
//		InitialDataJSON initialDataJSON=new InitialDataJSON();
//		
//		List<Student> students="";//Consultar la lista de estudiantes con login=login
//
//		if(students.size()==1) {
//			ExercisesJSON exercisesJSON=new ExercisesJSON(login,lessonCode);
//			SolutionsJSON solutionsJSON=new SolutionsJSON(login,lessonCode);
//
//			List<Exercise> exerciseList="";//Consultar la lista de ejercicios con lessonCode=lessonCode (ejercicios de una lección concreta)
//		
//			List<ExerciseJSON> exerciseJSONList=new ArrayList<ExerciseJSON>();
//			List<SolutionJSON> solutionJSONList=new ArrayList<SolutionJSON>();
//			
//			{//Para cada ejercicio de la lista
//				Exercise e=exerciseList.get(i);
//				//Crear objeto ExerciseJSON, copiando exerciseCode, wording y shortName de resourceType
//				//Añadir objeto ExerciseJSON creado a la lista exerciseJSONList
//			
//				List<Solution> solutionList="";//Consultar la lista de soluciones con exerciseCode=exerciseCode y login=login
//			
//				SolutionJSON sJSON;
//				//Si la lista es de 1 elemento (sólo puede haber un registro así en la tabla)
//					//Crear objeto sJSON, con la ubicación de la resolución y su calificación
//				//Si no
//					//Crear objeto sJSON, sin URL y calificación "NONE"
//				//Añadir objeto sJSON creado a la lista solutionJSONList
//
//			}
//			//Meter la lista exerciseJSONList en el objeto exercisesJSON
//			//Ajustar el atributo total de exercisesJSON según el tamaño de la lista exerciseJSONList
//
//			//Meter la lista solutionJSONList en el objeto solutionsJSON
//			//Ajustar el atributo total de solutionsJSON según el tamaño de la lista solutionJSONList
//		
//			//Meter el objeto exercisesJSON en el objeto initialDataJSON
//			//Meter el objeto solutionsJSON en el objeto initialDataJSON
//		}
//
//		return initialDataJSON;
//	}	
//
//
//	@SuppressWarnings("unchecked")
//	@POST//Anotación de método para REST
//	@Consumes(MediaType.APPLICATION_JSON)//Anotación del tipo de datos consumido	
//	@Produces(MediaType.TEXT_PLAIN)//Anotación del tipo de datos producido	
//	@Path("/addStudent")	
//	public Response addStudent(StudentJSON studentJSON) {
//		System.out.println("addStudent: "+hsr.getRemoteAddr());
//		Response response;
//		
//		List<Student> rolledStudentList=//Consultar la lista de estudiantes con dni=dni de studentJSON
//		if(rolledStudentList.size()==0) {
//			
//			String loginPrefix=studentJSON.getName().substring(0,1).toLowerCase()+studentJSON.getSurname().substring(0,1).toLowerCase();
//			
//			List<Student> students="";//Consultar la lista de estudiantes cuyo login comience por loginPrefix
//			
//			Student student=new Student();
//			student.setDni(studentJSON.getDni());
//			student.setLogin(loginPrefix+students.size());
//			student.setName(studentJSON.getName());
//			student.setSurname(studentJSON.getSurname());
//			
//			//Persistir objeto student en el Contexto de Persistencia
//			
//			response=Response.status(200).entity(/*nuevo login).build();
//		}
//		else
//			response=Response.status(200).entity(/*login del usuario).build();
//		
//		return response;
//	}
}
