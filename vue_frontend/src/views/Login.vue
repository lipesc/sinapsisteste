<template>
	<div class="login-background">
		<div class="header">
		  Sistema Teste Desenvolvedor Java
		 </div>
	
	
	<form @submit.prevent="login">
	  <input v-model="email" type="email" placeholder="Email"  />
	  <input v-model="password" type="password" placeholder="password" />
	  <button type="submit">Login</button>
	</form>
	</div>


	
	
</template>

<script setup>
import { useRouter } from 'vue-router';

const router = useRouter();

const login = () => {
  router.push('/lista');
};
</script>


<style scoped>
.header {
           background-color: #000;
           padding: 10px;
           text-align: top;
           font-size: 18px;
       }
.login-background {
  background-image: url('../public/electric-grid.jpg');
  background-size: contain;
  background-position: center;
  background-repeat: no-repeat;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.login-background h1 {
  color: #000; /* Cor do texto no modo claro */
}


button {
  padding: 10px 20px;
  font-size: 18px;
  cursor: pointer;
}
</style>