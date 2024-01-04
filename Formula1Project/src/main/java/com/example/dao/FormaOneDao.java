package com.example.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.helper.DBHelper;
import com.example.pojo.Cars;
import com.example.pojo.Drivers;
import com.example.pojo.Teams;

public class FormaOneDao {

	
	//get by id cars
		public static Cars getCarById(int id) throws SQLException {
			Connection con = DBHelper.getConnection();
			String querry = "select * from cars where id=?";
			PreparedStatement ps=con.prepareStatement(querry);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Cars c = new Cars(rs.getInt("id"), rs.getString("team_name"), rs.getInt("wins"), rs.getString("engine"), rs.getDate("year"));
				DBHelper.closeConnection();
				return c;
			}
			DBHelper.closeConnection();
			return null;
		}
		
	 //get by id drivers
		 public static Drivers getDriverById(int id) throws SQLException {
			Connection con = DBHelper.getConnection();
			String querry = "select * from drivers where id=?";
			PreparedStatement ps=con.prepareStatement(querry);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
					
			while(rs.next()) {
				 Drivers d = new Drivers(rs.getInt("id"), rs.getString("driver_name"), rs.getString("team"), rs.getInt("age") );
				 DBHelper.closeConnection();
				 return d;
			}
			DBHelper.closeConnection();
			return null;
		 }	
		 
		//get by id teams
		 public static Teams getTeamById(int id) throws SQLException {
			Connection con = DBHelper.getConnection();
			String querry = "select * from teams where id=?";
			PreparedStatement ps=con.prepareStatement(querry);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
					
			while(rs.next()) {
				 Teams t = new Teams(rs.getInt("id"), rs.getString("team_name"), rs.getString("team_principal"), rs.getDate("joining_year") );
				 DBHelper.closeConnection();
				 return t;
			}
			DBHelper.closeConnection();
			return null;
		 }
		
		//get all Cars
			public static ArrayList<Cars> allCars() throws SQLException{
				Connection con = DBHelper.getConnection();
				String querry = "select * from cars";
				PreparedStatement ps=con.prepareStatement(querry);
				ResultSet rs = ps.executeQuery();
				ArrayList<Cars> all = new ArrayList<Cars>();
				
				while(rs.next()) {
					Cars car = new Cars(rs.getInt("id"), rs.getString("team_name"), rs.getInt("wins"), rs.getString("engine"), rs.getDate("year"));
					
					all.add(car);
				}
				DBHelper.closeConnection();
				return all;
			}
			
		//get all Drivers
			public static ArrayList<Drivers> allDrivers() throws SQLException{
				Connection con = DBHelper.getConnection();
				String querry = "select * from drivers";
				PreparedStatement ps=con.prepareStatement(querry);
				ResultSet rs = ps.executeQuery();
				ArrayList<Drivers> all = new ArrayList<Drivers>();
				
				while(rs.next()) {
					Drivers dr = new Drivers(rs.getInt("id"), rs.getString("driver_name"), rs.getString("team"), rs.getInt("age") );
					
					all.add(dr);
				}
				DBHelper.closeConnection();
				return all;
			}
			
		//get all Teams
			public static ArrayList<Teams> allTeams() throws SQLException{
				Connection con = DBHelper.getConnection();
				String querry = "select * from teams";
				PreparedStatement ps=con.prepareStatement(querry);
				ResultSet rs = ps.executeQuery();
				ArrayList<Teams> all = new ArrayList<Teams>();
				
				while(rs.next()) {
					Teams tm = new Teams(rs.getInt("id"), rs.getString("team_name"), rs.getString("team_principal"), rs.getDate("joining_year") );
					
					all.add(tm);
				}
				DBHelper.closeConnection();
				return all;
			}
			
		//delete car
			public static void deleteCarById(int id) throws SQLException {
				Connection con = DBHelper.getConnection();
				String querry = "delete from cars where id=?";
				PreparedStatement ps=con.prepareStatement(querry);
				ps.setInt(1, id);
				ps.executeUpdate();
				DBHelper.closeConnection();

			}
			
		//delete driver
			public static void deleteDriverById(int id) throws SQLException {
				Connection con = DBHelper.getConnection();
				String querry = "delete from drivers where id=?";
				PreparedStatement ps=con.prepareStatement(querry);
				ps.setInt(1, id);
				ps.executeUpdate();
				DBHelper.closeConnection();

			}
			
		//delete team
			public static void deleteTeamById(int id) throws SQLException {
				Connection con = DBHelper.getConnection();
				String querry = "delete from teams where id=?";
				PreparedStatement ps=con.prepareStatement(querry);
				ps.setInt(1, id);
				ps.executeUpdate();
				DBHelper.closeConnection();

			}
			
		//create car
			public static void createCar(Cars car) throws SQLException {
				Connection con = DBHelper.getConnection();
				String querry = "insert into cars(team_name,  wins, engine, year) values(?,?,?,?) ";
				PreparedStatement ps=con.prepareStatement(querry);
				ps.setString(1, car.getTeamName());
				ps.setInt(2, car.getWins());
				ps.setString(3, car.getEngine());
				ps.setDate(4, car.getYear());
				ps.executeUpdate();
				DBHelper.closeConnection();
			}
		//create driver
			public static void createDriver(Drivers dr) throws SQLException {
				Connection con = DBHelper.getConnection();
				String querry = "insert into drivers(driver_name,  team, age) values(?,?,?) ";
				PreparedStatement ps=con.prepareStatement(querry);
				ps.setString(1, dr.getDriverName());
				ps.setString(2, dr.getTeam());
				ps.setInt(3, dr.getAge());
				ps.executeUpdate();
				DBHelper.closeConnection();
			}
			
		//create driver
			public static void createTeam(Teams tm) throws SQLException {
				Connection con = DBHelper.getConnection();
				String querry = "insert into teams(team_name,  team_principal, joining_year) values(?,?,?) ";
				PreparedStatement ps=con.prepareStatement(querry);
				ps.setString(1, tm.getTeamName());
				ps.setString(2, tm.getTeamPrincipal());
				ps.setDate(3, tm.getJoiningYear());
				ps.executeUpdate();
				DBHelper.closeConnection();
			}
			
			//edit car
			public static void editCar(Cars c) throws SQLException {
				Connection con = DBHelper.getConnection();
				String querry = "update cars set team_name=?, wins=?, engine=?, year=?  where id=?";
				PreparedStatement ps=con.prepareStatement(querry);
				ps.setString(1, c.getTeamName());
				ps.setInt(2, c.getWins());
				ps.setString(3, c.getEngine());
				ps.setDate(4, c.getYear());
				ps.setInt(5, c.getId());
				ps.executeUpdate();
				DBHelper.closeConnection();
			}
			
			//edit driver
			public static void editDriver(Drivers d) throws SQLException {
				Connection con = DBHelper.getConnection();
				String querry = "update drivers set driver_name=?, team=?, age=?  where id=?";
				PreparedStatement ps=con.prepareStatement(querry);
				ps.setString(1, d.getDriverName());
				ps.setString(2, d.getTeam());
				ps.setInt(3, d.getAge());
				ps.setInt(4, d.getId());
				ps.executeUpdate();
				DBHelper.closeConnection();
			}
			
			//edit team
			public static void editTeam(Teams t) throws SQLException {
				Connection con = DBHelper.getConnection();
				String querry = "update teams set team_name=?, team_principal=?, joining_year=?  where id=?";
				PreparedStatement ps=con.prepareStatement(querry);
				ps.setString(1, t.getTeamName());
				ps.setString(2, t.getTeamPrincipal());
				ps.setDate(3, t.getJoiningYear());
				ps.setInt(4, t.getId());
				ps.executeUpdate();
				DBHelper.closeConnection();
			}
}
