import { createRouter, createWebHistory } from "vue-router";
import Login from "../views/Login.vue";
import Lista from "../views/Lista.vue";
import Inclusao from "../views/Inclusao.vue";
import Alterar from "../views/Alterar.vue";
import VisualizarMap from "../views/VisualizarMap.vue";

const routes = [
	{path: "/", component: Login},
	{path: "/lista", component: Lista},
	{path: "/inclusao", component: Inclusao},
	{path: "/alterar", component: Alterar},
	{path: "/visualizar", component: VisualizarMap}
];



const router = createRouter({
  history: createWebHistory(),
  routes,
});


export default router;
